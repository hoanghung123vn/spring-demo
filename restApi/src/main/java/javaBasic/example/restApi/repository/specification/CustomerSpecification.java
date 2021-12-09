package javaBasic.example.restApi.repository.specification;

import javaBasic.example.restApi.entity.Customer;
import javaBasic.example.restApi.model.CustomerFilter;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerSpecification implements Specification<Customer> {
    private CustomerFilter filter;

    public CustomerSpecification(CustomerFilter filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
        if (filter != null) {
            predicates = createFilterPredicate(root, query, builder);
        }
        return query.where(builder.and(predicates.toArray(new Predicate[0]))).getRestriction();
    }

    private List<Predicate> createFilterPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();

        if (!Objects.isNull(filter.getFirstName())) {
            predicates.add(builder.equal(root.<String>get("firstName"), filter.getFirstName()));
        }

        if (!Objects.isNull(filter.getLastName())) {
            predicates.add(builder.equal(root.<String>get("lastName"), filter.getLastName()));
        }

        if (!Objects.isNull(filter.getEmail())) {
            predicates.add(builder.equal(root.<String>get("email"), filter.getEmail()));
        }

        return predicates;
    }
}
