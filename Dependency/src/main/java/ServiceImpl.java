public class ServiceImpl implements Service {
    private final Dependency dependency;

    public ServiceImpl(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public void calculate() {
        dependency.helpNoParameterNoreturnValue();
    }

    public int return5() {
        return 5;
    }
}
