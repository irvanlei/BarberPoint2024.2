public class ClienteValidationStrategy implements ValidationStrategy<Cliente> {
    @Override
    public void validate(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente é obrigatório.");
        }
    }
}
