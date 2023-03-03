package lab6.abstrac;

public class IceCreamFactoryA implements IceCreamFactory {
    @Override
    public IceCreamCone createIceCreamCone() {
        return new IceCreamConeA();
    }

    @Override
    public IceCreamSundae createIceCreamSundae() {
        return new IceCreamSundaeA();
    }
}
