public class StateB implements State {
    public void writeName(StateContext stateContext, String name) {
        System.out.println(name.toUpperCase());
        stateContext.setState(new StateA());

    }

}
