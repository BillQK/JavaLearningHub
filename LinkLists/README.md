_**Summary**_
• A linked list consists of one linkedList object and a number of Link objects.
• The linkedList object contains a reference, often called first , to the first link
in the list.
• Each Link object contains data and a reference, often called next , to the next
link in the list.
• A next value of null signals the end of the list.
• Inserting an item at the beginning of a linked list involves changing the new
link’s next field to point to the old first link and changing first to point to the
new item.Questions
• Deleting an item at the beginning of a list involves setting first to point to
first.next .
• To traverse a linked list, you start at first and then go from link to link, using
each link’s next field to find the next link.
• A link with a specified key value can be found by traversing the list. Once
found, an item can be displayed, deleted, or operated on in other ways.
• A new link can be inserted before or after a link with a specified key value,
following a traversal to find this link.
• A double-ended list maintains a pointer to the last link in the list, often called
last, as well as to the first.
• A double-ended list allows insertion at the end of the list.
• An Abstract Data Type (ADT) is a data storage class considered without
reference to its implementation.
• Stacks and queues are ADTs. They can be implemented using either arrays or
linked lists.
• In a sorted linked list, the links are arranged in order of ascending (or
sometimes descending) key value.
• Insertion in a sorted list takes O(N) time because the correct insertion point
must be found. Deletion of the smallest link takes O(1) time.
• In a doubly linked list, each link contains a reference to the previous link as
well as the next link.
• A doubly linked list permits backward traversal and deletion from the end of
the list.
• An iterator is a reference, encapsulated in a class object, that points to a link in
an associated list.
• Iterator methods allow the user to move the iterator along the list and access
the link currently pointed to.
• An iterator can be used to traverse through a list, performing some operation
on selected links (or all links).