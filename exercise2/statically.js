class Statically {
  //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
  glue = "Epoxy";
  jello = "Jello";

  moveAndShake() {
    console.log("Never stagnate in life.  Be agile, change, and improve...");
  }

  stubborn() {
    this.moveAndShake();
    console.log("Please don't make me change... I just don't like it...");
  }

  explain() {
    this.stubborn();
    //write an explanation for how the keyword static behaves differently in javascript vs. java.
    console.log(
      "I have no idea what static does but the minute that i deleted it, everything worked the way i think it should."
    );
  }
}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();
stats.moveAndShake();
stats.stubborn();
stats.explain();

// console.log(stats.#glue);
// console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
