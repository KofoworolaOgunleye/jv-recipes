package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.Date;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {
    public static SessionFactory getSessionFactory(){
        var sessionFactory = new Configuration()
                .setProperty("hibernate.connection.driver_class", "org.h2.Driver") // <-- Specifying our H2 in-memory database
                .setProperty(JAKARTA_JDBC_URL, "jdbc:h2:mem:db1")   // <-- Supplying our database's connection string
                .setProperty(JAKARTA_JDBC_USER, "sa")   // <-- Using the default username...
                .setProperty(JAKARTA_JDBC_PASSWORD, "") // <-- ... and password
                .setProperty(SHOW_SQL, TRUE.toString()) // <-- SQL formatting configuration
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .setProperty("hibernate.hikari.maximumPoolSize", "20")
//                .addAnnotatedClass(Recipe.class)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(Rating.class)
                .addAnnotatedClass(Ingredient.class)
//                .addAnnotatedClass(Image.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Category.class)
                .buildSessionFactory();
        return sessionFactory;
    }

    static void seed(){
        var sessionFactory = getSessionFactory();
        sessionFactory.inTransaction(session ->{});

/*
        Ingredient ingredient = new Ingredient("Peas","2","Tbsp");
        Category category = new Category("Simple");
        LocalDate date = LocalDate.now();
        User user = new User("bob","bob@bobby.com","bobman111","Admin",date);

        sessionFactory.inTransaction(session -> {
            session.persist(ingredient);
            session.flush(); // Synchronise the session with the database
            session.refresh(ingredient); // Refresh to retrieve the generated ID
            var ingredientWithID = ingredient.getId(); // Get the generated ID
            session.persist(category);
            session.flush(); // Synchronise the session with the database
            session.refresh(category); // Refresh to retrieve the generated ID
            var categoryWithID = category.getId(); // Get the generated ID
            session.persist(user);
            session.flush(); // Synchronise the session with the database
            session.refresh(user); // Refresh to retrieve the generated ID
            var userWithID = user.getId();

            Recipe recipe = new Recipe("Ramen","Ramen in a bowl","Put it in a pot and boil it",
                    1,2,1, "Easy",4,String.valueOf(ingredientWithID),
                    String.valueOf(categoryWithID),String.valueOf(userWithID),date,date);
            session.persist(recipe);
            session.flush();

        });*/
    }


}
