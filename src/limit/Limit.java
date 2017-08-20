
package limit;

public class Limit {
    public int left;
    public int right;
    public boolean inside;
    public Limit(int from, int till, boolean inside) {
        this.left = from;
        this.right = till;
        this.inside = inside;
    }
}
