package stayonasDev.practice.demo.project1.domain;

import java.time.LocalDate;

public class Member {
    Long id = 0L;
    String name;
    LocalDate joinDate;

    public Member( String name, LocalDate joinDate) {
        this.name = name;
        this.joinDate = joinDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
