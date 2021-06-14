영화 예매 사이트입니다.
main.jsp 가 메인이며 WebContent 아래에 있는 jsp 파일들은 메뉴 안에서의 결과 페이지들이며 
WebContent/result 안에 있는 jsp 파일들은 큰메뉴에서 유저가 어떤 동작을 취했을때에 나타나는 결과 페이지입니다.
원래 main page 안에 video 아래에 메인페이지에 있어야 할 영상이 있어야 하지만 크기나 너무 큰 관계로 제외하였습니다.(영상에는 들어가 있습니다.)
VO는 MovieVO UserVO 2개이며 MovieVO, UserVO 각각 말 그대로 유저와 영화 정보에 대한 DB를 임시저장하기 위한 클래스입니다.
그외 메서드는 굳이 나누지 않고 UserDAO와 MovieService에서 한번에 정의하였습니다.
