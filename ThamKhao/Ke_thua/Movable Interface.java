/*
 * Cho lớp Movable Point và Movable Interface như sau :

image

Cho một danh sách các điểm với tọa độ x, y và các lượt di chuyển, hãy xác định vị trí cuối cùng của các điểm ban đầu trong danh sách và in ra màn hình.

Input Format

Dòng 1 là N : số lượng điểm ban đầu

Mỗi điểm gồm : Dòng 1 là x, y, xSpeed, ySpeed, Dòng 2 là số lần di chuyển M, M dòng tiếp theo mô tả di chuyển

Constraints

1<=N<=1000

-1000<=x,y<=1000

0<=xSpeed,ySpeed<=100

Output Format

In ra kết quả của bài toán
Sample Input 0

8
0 7 9 5
4
Down
Left
Down
Down
8 2 4 7
7
Right
Up
Down
Up
Up
Right
Left
2 6 7 7
6
Left
Down
Left
Up
Up
Up
7 5 0 5
7
Right
Left
Up
Left
Right
Up
Up
7 4 7 7
3
Right
Right
Right
5 9 3 0
4
Down
Down
Up
Up
4 3 1 9
7
Up
Up
Up
Left
Left
Left
Right
5 2 9 1
3
Up
Right
Up
Sample Output 0

-9 22
12 -12
-12 -8
7 -10
28 4
5 9
2 -24
14 0
 */