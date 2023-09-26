package binary.tree;

import java.util.ArrayList;
import java.util.List;
class KaryTreeNode<T> {
    T value;
    List<KaryTreeNode<T>> children;

    public KaryTreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(KaryTreeNode<T> child) {
        this.children.add(child);
    }
}
