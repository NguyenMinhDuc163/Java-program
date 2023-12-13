ho Interface Movable, lớp MovablePoint, MovableCircle được thiết kế như sau :

image

Cho danh sách các hình tròn kèm theo bán kính và tọa độ tâm của hình tròn, thực hiện di chuyển tâm hình tròn theo các hướng up, down, left, right sau đó in ra tọa độ tâm hình tròn sau di chuyển.

Input Format

Dòng 1 là N : số lượng hình tròn ban đầu

Mỗi điểm gồm : Dòng 1 là tọa độ tâm hình tròn, tốc độ di chuyển theo trục x và y, bán kính, Dòng 2 là số lần di chuyển M, M dòng tiếp theo mô tả di chuyển

Constraints

1<=N<=1000

-1000<=x,y<=1000

0<=xSpeed,ySpeed<=100

Output Format

In ra kết quả của bài toán
Sample Input 0

9
6 7 3 5 12
3
Right
Left
Up
4 1 5 7 15
6
Up
Down
Down
Right
Left
Up
1 8 9 4 77
6
Down
Down
Left
Right
Left
Up
8 2 4 8 56
6
Right
Down
Up
Left
Left
Left
2 9 3 8 95
5
Left
Right
Left
Right
Left
2 2 0 4 45
4
Down
Left
Down
Right
1 0 8 3 23
7
Up
Left
Down
Right
Left
Left
Left
6 4 9 2 25
7
Up
Down
Down
Right
Down
Down
Left
9 7 5 0 19
7
Up
Right
Left
Down
Left
Right
Down
Sample Output 0

6 2
4 1
-8 12
0 2
-1 9
2 10
-23 0
6 10
9 7