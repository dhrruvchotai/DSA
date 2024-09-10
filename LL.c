#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node* next;
}Node;

Node* createNode(int data){

        Node* newNode = (Node*)(malloc(sizeof(Node)));

        newNode->data = data;
        newNode->next = 0;

        return newNode;
}

Node* insertAtFirst(Node* first,int val){

    Node* newNode = createNode(val);

    if(first == NULL){
        return newNode;
    }

    newNode -> next = first;
    return newNode;
}

Node* insertAtLast(Node* first,int val){

    Node* newNode = createNode(val);
    if(first == NULL){
        return newNode;
    }

    Node* curr = first;

    while(curr -> next){
        curr = curr -> next;
    }

    curr -> next = newNode;
    return first;
}

Node* deleteFirst(Node* first){
    if(first == NULL){
        printf("LinkedList is empty.");
    }
    first = first -> next;
    return first;
}

Node* deleteLast(Node* first){

    if(first == NULL){
        printf("LinkedList in empty.");
    }

    if(first -> next == NULL) first = NULL;

    Node* curr = first;

    while(curr -> next -> next){
        curr = curr -> next;
    }

    curr -> next = NULL;

    return first;
}

void printList(Node* first){

    if(first == NULL){
        printf("List is Empty.");
        return;
    }

    Node* curr = first;

    while(curr){
        printf("%d -> ",curr -> data);
        curr = curr -> next;
    }

    printf("null");
}

int main(){

    Node* first = NULL;
    first = createNode(1);

    first = insertAtFirst(first,2);
    first = insertAtFirst(first,3);
    first = insertAtLast(first,10);

    first = deleteFirst(first);
    first = deleteLast(first);

    printList(first);

    return 0;

}