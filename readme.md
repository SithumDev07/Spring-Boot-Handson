# Spring Boot Handson

### Helping queries

method names should be same as model

    public interface AlienRepo extends CrudRepository<Alien, Integer> {
        List<Alien> findByAname(String aname);
    }

when calling

    @Autowired
    AlienRepo repo;

    repo.findByAname("Casper");

It also works with other semantics,

    List<Alien> findByAidGreaterThan(int aid);

    repo.findByAidGreaterThan(100);

It only gets aids greater than 100
