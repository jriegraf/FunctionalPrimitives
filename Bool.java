public class Bool {

    final boolean state;

    public Bool(boolean state) {
      this.state = state;
    }

    public Bool ifTrue(Runnable doThis) {
      if (state) {
        doThis.run();
      }
      return this;
    }

    public Bool ifFalse(Runnable doThis) {
      if (!state) {
        doThis.run();
      }
      return this;
    }

  }
