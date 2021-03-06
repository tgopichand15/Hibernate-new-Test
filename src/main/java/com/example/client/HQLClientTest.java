package com.example.client;

import com.example.entities.Address;
import com.example.entities.Employee;
import com.example.entities.TestEmployee;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

//hql example

import java.util.*;

public class HQLClientTest {

    public static void main(String[] args){
        SessionFactory sf= HibernateUtil.getSessionFactory();
        //getAllEmployees(sf);
        //getEmployeebyId(sf);
        //getEmployeebyIdandSalary(sf);
        //getnameFromEmployee(sf);
        //insertRecordsintoDB(sf);
        //updateEmployeebuEmailbyid(sf);
        //getEmployeeByIDHQLQuery(sf);
        //getEmployeeGroupBYExample(sf);
        //createTestEmployee(sf);
    }

    /*public static void getAllEmployees(SessionFactory sf){

        try(Session session =sf.openSession()){
            String HQl="From Employee";
            Query<Employee> query=session.createQuery(HQl,Employee.class);
            List<Employee> l=query.list();
            l.forEach(System.out::println);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static Employee getEmployeebyId(SessionFactory sf){
        try(Session session =sf.openSession()){
            String HQl="From Employee where id = ?0";
            Query<Employee> query=session.createQuery(HQl,Employee.class);
            //values in query.setParamanet(position,value)
            query.setParameter(0,0);

            Employee e=query.uniqueResult();
            System.out.println(e);
            return e;


        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void getEmployeebyIdandSalary(SessionFactory sf){
        try(Session session =sf.openSession()){
            String HQl="From Employee where id = :empid and salary=:salary";
            Query<Employee> query=session.createQuery(HQl,Employee.class);
            //values in query.setParamanet(position,value)
            query.setParameter("empid",0);
            query.setParameter("salary",50000);
            Employee e=query.uniqueResult();
            System.out.println(e);
            //return e;


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void getnameFromEmployee(SessionFactory sf){
        try(Session session =sf.openSession()){
            String HQl="select name from Employee";
            Query<String> query=session.createQuery(HQl);
            List<String> l=query.list();
            l.forEach(System.out::println);


            //return e;


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void insertRecordsintoDB(SessionFactory sf){
        //insertionn we can't use insert into in hql we can copy from other table and insert into this table provided both shoudl have same table structure otherwise we can insert using session.save  method to insert

        try(Session session=sf.openSession()){
            String HQl="Insert into Employee(id,name,salary,addressList" +"select id,name,salary,addressList from backupEmployee";

            Query query=session.createQuery(HQl);
            session.beginTransaction();
            int executeupdate=query.executeUpdate();

            if(executeupdate>0){
                System.out.println(executeupdate+"insertion succeded");
            }

            session.getTransaction().commit();
        }
    }

    public static void insertRecordsintoDB(SessionFactory sf){
        //insertionn we can't use insert into in hql we can copy from other table and insert into this table provided both shoudl have same table structure otherwise we can insert using session.save  method to insert

        try(Session session=sf.openSession()){
            String HQl="Insert into Employee(id,name,salary,addressList" +"select id,name,salary,addressList from backupEmployee";

            Query query=session.createQuery(HQl);
            session.beginTransaction();
            int executeupdate=query.executeUpdate();

            if(executeupdate>0){
                System.out.println(executeupdate+"insertion succeded");
            }

            session.getTransaction().commit();
        }
    }

    public static void UpdateEmployyebyEmailbyid(SessionFactory sf){
        int id=2;
        String newemailid="gopi@test.com";
        try(Session session=sf.openSession()){
            String HQl="Update Employee set email:=newemailid where empid:id";

            Query query=session.createQuery(HQl);
            query.setParameter("newemailid",newemailid);
            query.setParamaeter("id",id);
            session.beginTransaction();
            int executeupdate=query.executeUpdate();

            if(executeupdate>0){
                System.out.println(executeupdate+"updation succeded");
            }

            session.getTransaction().commit();
        }
    }*/

   /* public static void getEmployeeByIDHQLQuery(SessionFactory sf){
        int emp=1;
        try(Session session=sf.openSession()){
            String HQl="from Employee emp LEFT JOIN FETCH emp.address where emp.employeeId=:emp";

            Query query=session.createQuery(HQl);
            query.setParameter("emp",emp);
            session.beginTransaction();
            Address a=(Address)query.uniqueResult();
            System.out.println("Address is "+a);
            session.getTransaction().commit();
        }
    }*/



    /*public static void getEmployeeGroupBYExample(SessionFactory sf){
        int emp=1;
        try(Session session=sf.openSession()){
            String HQl="select t.department,sum(t.salary) FROM TestEmployee t group by t.department";

            Query<Object[]> query=session.createQuery(HQl);
            session.beginTransaction();
            List<Object[]> a=(List<Object[]>)query.list();
            for(Object[] l : a){
                System.out.print((String) l[0]);
                System.out.println((Long) l[1]);
            }
            session.getTransaction().commit();
        }
    }


    public static void createTestEmployee(SessionFactory sf){
        try(Session session= HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            TestEmployee t=new TestEmployee();
            t.setName("Ramesh");
            t.setDepartment("Mech");
            t.setSalary(40000);

            session.save(t);
            session.getTransaction().commit();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }*/



    }





