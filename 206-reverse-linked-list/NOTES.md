**Iterative approach**
​
we need 3 pointers, current, head and previous;
​
if we break the link like this head.next = prev; then, we would loose the reference to
head.next; So, we gonna store that info in a pointer, and keep adjusting the head and the new node's value. such that head -> next is not lost.
​
​
forward -> head.nexr;
head ->