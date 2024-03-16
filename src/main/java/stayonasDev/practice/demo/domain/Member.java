package stayonasDev.practice.demo.domain;

import java.time.LocalDate;

public class Member {
    Long id;
    String name;
    LocalDate joinDate;

    public Member(Long id, String name, LocalDate joinDate) {
        this.id = id;
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
}
