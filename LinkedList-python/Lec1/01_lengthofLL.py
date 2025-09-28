# Problem Statement: Given the head of a linked list, print the length of the linked list.

class Node:
    def __init__(self, value):
        self.data = value
        self.next = None

def printLength(head):
    count = 0
    temp = head
    while(temp):
        count+=1
        temp = temp.next
    return count

node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(5)

node1.next = node2
node2.next = node3
node3.next = node4
print(printLength(node1))
