class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    # 1.
    def add_front(self, val):
        new_node = Node(val)
        new_node.next = self.head
        self.head = new_node

    # 2.
    def add_back(self, val):
        new_node = Node(val)
        if not self.head:
            self.head = new_node
            return

        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node

    # 3.
    def remove_last(self):
        if not self.head:
            return

        if not self.head.next:
            self.head = None
            return

        temp = self.head
        while temp.next.next:
            temp = temp.next

        temp.next = None

    # 4.
    def print_list(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ")
            temp = temp.next
        print()

    # 5.
    def search(self, val):
        temp = self.head
        while temp:
            if temp.data == val:
                return True
            temp = temp.next
        return False

    # 6.
    def insert_at(self, pos, val):
        if pos == 0:
            self.add_front(val)
            return

        new_node = Node(val)
        temp = self.head

        for _ in range(pos - 1):
            if not temp:
                return
            temp = temp.next

        if not temp:
            return

        new_node.next = temp.next
        temp.next = new_node

    # 7.
    def remove_by_value(self, val):
        if not self.head:
            return

        if self.head.data == val:
            self.head = self.head.next
            return

        temp = self.head
        while temp.next and temp.next.data != val:
            temp = temp.next

        if temp.next:
            temp.next = temp.next.next

    # 8.
    def merge(self, other):
        if not self.head:
            self.head = other.head
            return

        temp = self.head
        while temp.next:
            temp = temp.next

        temp.next = other.head

    # 9.
    def reverse(self):
        prev = None
        curr = self.head

        while curr:
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node

        self.head = prev

    # 10.
    def sort(self):
        sorted_list = None
        curr = self.head

        while curr:
            next_node = curr.next

            if not sorted_list or sorted_list.data >= curr.data:
                curr.next = sorted_list
                sorted_list = curr
            else:
                temp = sorted_list
                while temp.next and temp.next.data < curr.data:
                    temp = temp.next

                curr.next = temp.next
                temp.next = curr

            curr = next_node

        self.head = sorted_list


if __name__ == "__main__":
    lst = LinkedList()

    lst.add_front(3)
    lst.add_front(1)
    lst.add_back(5)
    lst.add_back(2)

    lst.print_list()  # 1 3 5 2

    lst.insert_at(2, 4)
    lst.print_list()  # 1 3 4 5 2

    lst.remove_by_value(3)
    lst.print_list()  # 1 4 5 2

    lst.remove_last()
    lst.print_list()  # 1 4 5

    print("Found" if lst.search(4) else "Not Found")

    lst.reverse()
    lst.print_list()

    lst.sort()
    lst.print_list()