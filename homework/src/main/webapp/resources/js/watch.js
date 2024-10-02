$(document).ready(function () {
    const serverarea = $('#serverarea');
    const timearea = $('#timearea');
    const startButton = $('#startButton');
    const stopButton = $('#stopButton');

    let clientInterval;
    let serverInterval;
    let isRunning = false;

    // 시계 시작하기
    function startClock() {
        if (!isRunning) {
            isRunning = true;
        }

        // 클라이언트 시간 1초마다 갱신
        clientInterval = setInterval(() => {
            timearea.text(new Date().toLocaleString());
        }, 1000);

        // 서버 시간 1초마다 요청 보내기
        serverInterval = setInterval(() => {
            $.ajax({
                url: "/homework/now.do",
                method: "GET",
                dataType: "json",
                success: function (jsonObj) {
                    serverarea.text(jsonObj.now);
                },
                error: function (xhr) {
                    console.log("에러 : " + xhr.status);
                }
            });
        }, 1000);
    }

    // 시계 멈추기
    function stopClock() {
        if (isRunning) {
            isRunning = false;
            clearInterval(clientInterval);
            clearInterval(serverInterval);
        }
    }

    // 버튼 클릭 이벤트 설정
    startButton.on("click", startClock);
    stopButton.on("click", stopClock);

    // 초기 상태는 멈춤 상태로 설정
    stopClock();
});
