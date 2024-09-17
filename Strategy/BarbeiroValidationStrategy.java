public class BarbeiroValidationStrategy implements ValidationStrategy<Barbeiro> {
    @Override
    public void validate(Barbeiro barbeiro) {
        if (barbeiro.getEspecialidade() == null || barbeiro.getEspecialidade().isEmpty()) {
            throw new IllegalArgumentException("Especialidade do barbeiro é obrigatória.");
        }
    }
}
