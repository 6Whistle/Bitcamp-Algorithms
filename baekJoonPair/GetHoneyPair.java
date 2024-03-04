package baekJoonPair;

import java.util.Scanner;

public class GetHoneyPair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, max = 0;
        int leftSum, middleSum, rightSum;
        
        //배열 입력
        int[] arr = new int[scan.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
            //합계 저장
            sum += arr[i];
            //처음 배열의 처음과 마지막 값을 제외한 값 중 최대값을 찾음
            if(arr[i] > max && i != 0 && i != arr.length - 1){
                max = arr[i];
            }
        }

        //중간에 꿀통이 있을 경우
        //양 끝에 벌이 있어야 하기에 전체 값에서 양 끝 값을 뺌
        //꿀통은 중간의 값들 중 가장 큰 값에 위치해야 가장 큼
        max += sum - arr[0] - arr[arr.length - 1];
//        max = sum + max - arr[0] - arr[arr.length - 1];

        //가장 오른쪽에 꿀통이 있을 경우
        //가장 왼쪽에 벌이 있어야 함
        //나머지 벌은 반복문을 통해 탐색해가며 가장 큰 값을 찾아감
        //shape : (벌) middle (벌) right (꿀통)
        middleSum = 0;
        rightSum = sum - arr[0] - arr[1];
        for(int i = 1; i < arr.length - 1; i++){
            //중간 구간은 1번, 우측 구간은 꿀통을 포함 2번 더해짐
            max = Math.max(max, middleSum + rightSum * 2);
            middleSum += arr[i];
            rightSum -= arr[i + 1];
        }

        //가장 왼쪽에 꿀통이 있을 경우
        //위의 위의 경우와 대칭으로 진행
        middleSum = 0;
        leftSum = sum - arr[arr.length - 1] - arr[arr.length - 2];
        for(int i = arr.length - 2; i > 0; i++){
            max = Math.max(max, middleSum + leftSum * 2);
            middleSum += arr[i];
            leftSum -= arr[i - 1];
        }

        System.out.println(max);

    }
}
