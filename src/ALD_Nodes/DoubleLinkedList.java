package ALD_Nodes;

public class DoubleLinkedList {

    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }


    public void addBookingToLastPos(Booking newBooking) {
        Node newNode = new Node();
        newNode.setBooking(newBooking);

        //Wenn die liste leer ist, ist die neue Node das erste UND das letzte
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        //falls schon etwas in der liste ist soll es zu schluss dazugehängt werden
        else {
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;  //Das letzte element auch nochmal definieren
        }
    }

    public void addBookingAtIndex(int index, Booking newBooking) {
        Node newNode = new Node();
        newNode.setBooking(newBooking);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            if (index == 0) {   // Wenn der index 0 angegebne wird
                newNode.setNext(first);
                first.setPrevious(newNode);
                first = newNode;

            } else {
                Node predecessorNode = first;
                for (int i = 0; i < index-1; i++) {    //Mit der schleife finde ich den vorgänger vom eingegebenen index
                    predecessorNode = predecessorNode.getNext(); //Weiterhüpfen zur nächsten Node bis zum eingegeben index

                    //Wenn der index größer ist als die liste
                    if (predecessorNode == last) {
                        break;
                    }

                }
                newNode.setNext(predecessorNode.getNext());
                newNode.setPrevious(predecessorNode);
                predecessorNode.setNext(newNode);
                Node afterNewNode = newNode.getNext();
                if (afterNewNode != null) { // Wenn die Node ganz zum schluss hinzugefügt wird passt diese zeile nicht, daher muss ich das so schreiben

                    afterNewNode.setPrevious(newNode);
                } else {//Wenn die afterNewNode null ist dann muss ich das last auch verschieben
                    last = newNode;
                }
            }

        }
    }
}
