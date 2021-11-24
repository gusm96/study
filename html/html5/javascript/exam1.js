const choiceNum = document.querySelector(".choiceNum"),
  first = document.querySelector(".first"),
  second = document.querySelector(".second");

var input = prompt("숫자를 입력하세요.");
var numberInput = Number(input);

choiceNum.innerText = `사용자가 입력한 숫자는 ${numberInput} 입니다.`;

if (numberInput < 0) {
  first.innerText = "음수 입니다.";
} else if (numberInput > 0) {
  first.innerText = "양수 입니다.";
}
if (numberInput % 2 == 0) {
  second.innerText = "짝수 입니다.";
} else {
  second.innerText = "홀수 입니다.";
}
