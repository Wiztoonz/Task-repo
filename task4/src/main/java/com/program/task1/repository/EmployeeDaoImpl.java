package com.program.task1.repository;

import com.program.task1.dto.EmployeeDto;
import com.program.task1.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private SessionFactory sessionFactory;
    private EmployeeDto employeeDto;

    @Autowired
    public EmployeeDaoImpl(SessionFactory sessionFactory, EmployeeDto employeeDto) {
        this.sessionFactory = sessionFactory;
        this.employeeDto = employeeDto;
    }

    private Session session() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable save(EmployeeEntity employee) {
        return session().save(employee);
    }

    @Override
    public void update(EmployeeEntity employee, Serializable id) {
        session().update(employee);
    }

    @Override
    public EmployeeEntity findById(Serializable id) {
        return session().get(EmployeeEntity.class, id);
    }

    @Override
    public void delete(Serializable id) {
        EmployeeEntity emp = findById(id);
        session().delete(emp);
    }

    @Override
    public List<EmployeeEntity> findAll() {
        CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
        CriteriaQuery<EmployeeEntity> criteriaQuery = criteriaBuilder.createQuery(EmployeeEntity.class);
        Root<EmployeeEntity> entityRoot = criteriaQuery.from(EmployeeEntity.class);
        CriteriaQuery<EmployeeEntity> all = criteriaQuery.select(entityRoot);
        TypedQuery<EmployeeEntity> allQuery = session().createQuery(all);
        return allQuery.getResultList();
    }

}
