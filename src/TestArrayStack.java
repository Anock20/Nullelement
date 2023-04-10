public class TestArrayStack {
    public static void main(String[] args) {
        Stack crates = new ArrayStack(4);
        crates.push("CARROTS");
        crates.push("ORANGES");
        crates.push("RAISINS");
        System.out.println("crates.size(): " + crates.size()
                + "\tcrates.pop(): " + crates.pop());
        crates.push(null);

    }
}