public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

  private OldCoffeeMachine oldVendingMachine;

  public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
    this.oldVendingMachine = oldVendingMachine
}
  @Override
  public void chooseFirstSelection() {
    this.oldVendingMachine.selectA();
  }

  @Override
  public void chooseSecondSelection() {
    this.oldVendingMachine.selectB();
  }
}
