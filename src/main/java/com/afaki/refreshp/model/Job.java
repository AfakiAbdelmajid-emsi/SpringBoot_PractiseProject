package com.afaki.refreshp.model;

public class Job {
    private long id;
    private String title;
    private String description;
    private String company;
    private String location;
    private double salary;
    private JobStatus status;
    public Job() {}

    public Job(long id, String title, String description, String company, String location, double salary, JobStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }
}