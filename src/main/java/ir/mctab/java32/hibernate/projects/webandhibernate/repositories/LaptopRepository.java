package ir.mctab.java32.hibernate.projects.webandhibernate.repositories;

import ir.mctab.java32.hibernate.projects.webandhibernate.config.hibernate.repositories.CrudRepository;
import ir.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop;

public class LaptopRepository extends CrudRepository<Laptop, Long> {
    @Override
    protected Class<Laptop> getEntityClass() {
        return Laptop.class;
    }

    private static LaptopRepository laptopRepository;

    private LaptopRepository(){

    }

    public static LaptopRepository getInstance() {
        if (laptopRepository == null) {
            laptopRepository = new LaptopRepository();
        }
        return laptopRepository;
    }
}
