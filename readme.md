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

### Writing my own queries

    @Query("from Alien where aname=?1 order by aid")
    List<Alien> findByAnameSorted(String aname);

## REST API

its usually looks www.mmon.com/aliens means get all aliens

    @AutoWired
    AlienRepo repo;

    @RequestMapping("/aliens")
    @ResponseBody
    public String getAliens() {
        return repo.findAll().toString();
    }

When we fetch specific alien id (Parameter, we call wildcard)

    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public String getAlien(@PathVarible("aid") int aid) {
        return repo.findById(aid).toString();
    }
