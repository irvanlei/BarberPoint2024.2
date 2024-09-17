public class BarbeiroService {

    private static BarbeiroService instance;

    private BarbeiroService() {
    }

    public static BarbeiroService getInstance() {
        if (instance == null) {
            instance = new BarbeiroService();
        }
        return instance;
    }

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    public List<Barbeiro> findAll() {
        return barbeiroRepository.findAll();
    }

    public Optional<Barbeiro> findById(Long id) {
        return barbeiroRepository.findById(id);
    }

    public Barbeiro save(Barbeiro barbeiro) {
        return barbeiroRepository.save(barbeiro);
    }

    public boolean deleteById(Long id) {
        if (barbeiroRepository.existsById(id)) {
            barbeiroRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
