# Project10_H_2

두 수를 입력하고 더하기, 빼기, 곱하기, 나누기 라디오 버튼을 선택한 후 <계산하기>를 클릭하면 세컨드 액티비티에서 계산 후 값을 돌려받는 앱

메인 액티비티에서 입력한 값을 Intent intent = new Intent(getApplicationContext(), SecondActivity.class);를 통해 세컨드 액티비티에 넘겨주고    
세컨트 액티비티에서 계산한 값을 setResult(RESULT_OK, outIntent);를 통해 돌려준 뒤   
Toast를 통해 결과값을 출력한다

그동안은 메인액티비티와 서브액티비티를 연결하는 과정만 배웠는데 이를 통해 값을 주고 받는 법을 익혔다


![Project10_H_2](https://user-images.githubusercontent.com/37572367/88146629-140ec000-cc37-11ea-835b-eeac5134cb3e.PNG)
![Project10_H_2-1](https://user-images.githubusercontent.com/37572367/88146637-153fed00-cc37-11ea-8f75-0e43a2fb97a8.PNG)
