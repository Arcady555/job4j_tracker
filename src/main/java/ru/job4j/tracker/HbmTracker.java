package ru.job4j.tracker;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class HbmTracker implements Store, AutoCloseable {
    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    @Override
    public Item add(Item item) {
        return HibernateRun.create(item, sf);
    }

    @Override
    public boolean replace(int id, Item item) {
        item.setId(id);
        HibernateRun.update(item, sf);
        return true;
    }

    @Override
    public boolean delete(int id) {
        HibernateRun.delete(id, sf);
        return true;
    }

    @Override
    public List<Item> findAll() {
        return HibernateRun.findAll(sf);
    }

    @Override
    public List<Item> findByName(String key) {
        return HibernateRun.findByName(key, sf);
    }

    @Override
    public Item findById(int id) {
        return HibernateRun.findById(id, sf);
    }

    @Override
    public void close() throws Exception {
        StandardServiceRegistryBuilder.destroy(registry);
    }
}