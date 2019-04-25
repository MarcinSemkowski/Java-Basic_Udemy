package Inner_And_Abstract_Classes_and_Interfaces.L_5;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        return rightLink = item;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        if(item !=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else{
         return -1;
        }
    }

}
