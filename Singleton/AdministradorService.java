public class AdministradorService {

    private static AdministradorService instance;

    private AdministradorService() {
    }

    public static AdministradorService getInstance() {
        if (instance == null) {
            instance = new AdministradorService();
        }
        return instance;
    }

    @Autowired
    private AdministradorRepository administradorRepository;

    public List<Administrador> findAll() {
        return administradorRepository.findAll();
    }

    public Optional<Administrador> findById(Long id) {
        return administradorRepository.findById(id);
    }

    public Administrador save(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    public void deleteById(Long id) {
        administradorRepository.deleteById(id);
    }
}
