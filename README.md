                                                                       # 캡스톤 디자인 결과보고서
                                                                       
                                                        ## STRAIGHT Tradic 쓰레기 백과사전 애플리케이션 개발

1. 수행 과제 개요
1.1 과제 개발 요약
■ 사람들이 배출하는 쓰레기는 점점 많아지지만, 쓰레기의 올바른 처리방법과 정확한 분리 배출법을 모르는 사람들이 
많아지면서 쓰레기를 버리는 방법을 자세히 알려주는 앱을 만들면 도움이 될 것으로 생각되어서 애플리케이션을 개발하였다.
■ Tradic은 스마트폰 애플리케이션을 통해 쓰레기에 대한 정보와 사용자 간의 의사소통을 통해서 보다 정확한 분리배출 방법을 얻을 수 있다.

1.2 과제 개발의 필요성
(1) 교육적 필요성
■ 분리배출을 참여 인식을 높이는 사회구성원으로서 책임감을 심어줄 수 있다. 분리배출에 대한 실천이 올바른 분리배출 참여도를 높일 수 있도록 지속적인 교육적 필요성을 느낄 수 있다.

(2) 기술 개발적 필요성
■ 회원가입을 통해 불법 광고 등 유해 사이트 홍보를 차단한다.
■ 게시판 기능을 통해 사용자 간 의사소통을 하여 더욱 정확한 정보를 얻을 수 있다.
■ 품목화면을 통해 가전제품 같은 경우 사용자가 바로 버릴 수 있도록 링크를 통해 사이트로 안내한다.

(3) 상업적 필요성
■ 다른 제품의 광고를 받아 배너를 제작해 부착함으로써 수익을 만듭니다. 한 광고를 보기 싫어하는 회원들도 많아서 프리미엄 서비스를 만들어 일정 금액을 받고 광고를 차단하는 기능을 
추가합니다.

(4) 기타 필요성
■ 현재 환경문제가 많이 발생하는데 앱을 통해 사용자들이 분리수거를 올바르게 하게 된다면 환경문제도 완화할 수 있을 것입니다.
■ 귀여운 아이콘을 통해 사용자의 관심을 끌어 앱을 클릭할 수 있도록 한다.

![image](https://user-images.githubusercontent.com/48309309/160373754-61807a0f-95ee-4b26-9751-908cdac64b1d.png)

1.3 개발 목표

■ 회원가입 및 로그인 기능 + 비회원(익명) 입장 페이지

![image](https://user-images.githubusercontent.com/48309309/160373933-7d84c68e-833e-4b2f-87f9-875211d09d4a.png)
![image](https://user-images.githubusercontent.com/48309309/160373925-7431dff1-e7ab-477c-ab85-5bfc0b286183.png)
![image](https://user-images.githubusercontent.com/48309309/160373834-e9705988-f8cb-4579-9b80-8bdb445b64e3.png)

데이터베이스에서 아이디, 비밀번호를 저장하여 회원이 로그인할 수 있도록 한다.

■ 사용자에게 도움이 되는 기본 분리수거 규칙 설명 페이지

![image](https://user-images.githubusercontent.com/48309309/160374033-1222b562-018f-4eee-8717-f7de30a1cb3f.png)
![image](https://user-images.githubusercontent.com/48309309/160374041-359f49bc-698d-4ffa-bf13-32cfad1d608a.png)

로그인하고 난 후 올바른 분리배출, 분리배출의 핵심 4가지 정보를 얻을 수 있다.

■ 품목 및 설명 화면 페이지

![image](https://user-images.githubusercontent.com/48309309/160374081-50b623c3-f426-4145-969c-b53085c25157.png)
![image](https://user-images.githubusercontent.com/48309309/160374090-7344c2b9-6699-4070-87f6-27fa91fe8871.png)
![image](https://user-images.githubusercontent.com/48309309/160374098-d3037ee4-e017-4a12-83cb-3304f21ab110.png)

쓰레기 품목에 대한 정보를 살펴볼 수 있도록 한다. 해당하는 품목을 클릭 시 분리배출 방법과 
바로 가기 링크를 클릭 시 버릴 수 있도록 해당 사이트로 안내한다.

■ 게시판 기능 + 댓글 기능 + 자신이 작성한 글 수정 및 확인 기능

![image](https://user-images.githubusercontent.com/48309309/160374139-e719d1c8-4d5b-4d1c-aade-8971d7f83a35.png)
![image](https://user-images.githubusercontent.com/48309309/160374148-99b01614-7cd2-4564-959f-30a12c54e0e2.png)

사용자 간 커뮤니케이션을 통해 정보를 공유할 수 있도록 한다.

1.4 과제 수행 내용, 범위 및 방법
(1) 과제의 내용과 범위
■ 회원, 비회원 모두 가능하게 하여 모든 사람이 이용할 수 있지만, 광고에 유무와 출몰 빈도를 따르게 하여 차별점을 둘 예정

■ 쓰레기를 검색하게 되면 그에 대한 재활용 여부, 분류 종류, 조심해야 할 점, 처리방법 등을 알려주어 사용자가 
올바른 방법으로 쓰레기를 처리하도록 유도

■ 게시판을 통해 사용자들이 서로에게 처리방법을 물어보고 댓글을 통하여 해당 주제에 관해 이야기할 수 있음

■ 다른 제품의 광고를 받아 배너를 제작해 부착함으로써 수익을 창출 또한 광고를 보기 싫어하는 회원들도 많으므로 프리미엄 서비스를 만들어 일정 금액을 받고 광고를 차단하는 기능을 추가

(2) 과제 내용별 참여 학생 간의 역할 분담
■ 황준선 : 총괄 및 안드로이드 개발
■ 김유겸 : 기획 및 UI/UX 개발
■ 이가은 : 안드로이드 개발, UI 개발
■ 이소정 : 안드로이드 개발, UI 개발

1.5 개발 과제 활용 및 파급효과
(1) 산업적, 기술적 파급효과(시장성 등)
■ 우리나라에서 하루 1,035톤, 한해에 38만 톤의 일반 쓰레기가 발생하고 있다. 그리고 연간 4천억 원의 자원이 낭비되고 있으며 쓰레기 처리비용만 1000억 원을 넘어가고 있다. 이 앱을 통해 정확한 쓰레기 배출을 한다면 연간 사용되는 쓰레기처리 비용 절감뿐만 아니라 환경파괴와 자원고갈 문제해결도 기대할 수 있다.
(2) 최종결과물의 활용방안
■ 사용자가 쓰레기를 처리할 때 궁금한 부분이 있으면 앱에 접속하여 검색하거나 게시판을 통해 사용자 간 리사이클링 방법과 업사이클링 방법 등 올바른 정보를 공유하여 올바른 분리배출을 할 수 있게 된다.

2. 과제 개발 결과
   2.1 과제 계획서 (결과)
   (1) 참여자별 활동
   ■ 황준선 : 총괄 및 안드로이드 개발
   ■ 김유겸 : 기획 및 UI/UX 개발
   ■ 이가은 : 안드로이드 개발, UI
   ■ 이소정 : 안드로이드 개발, UI

(2) 활동(업무)의 정의
■ 기획 – 요구사항 분석, 사용자 조사, 유사 서비스 분석, 정보 구조설계, 화면설계
■ 안드로이드 개발 – XML, Kotlin(설계 화면 구현 및 기능구현)
■ DB – DB 설계 및 환경 구출, 연동, 추출

(3) 활동 추진 시간 계획 (스케줄링)
![image](https://user-images.githubusercontent.com/48309309/160374299-ee5d6c14-2a1f-4d73-bda6-97bb5b90cf36.png)

(4) 예산 사용

- 없음

(5) 개발환경
■ 개발 플랫폼 (하드웨어 포함): 안드로이드 스마트폰, USB 선, 노트북
■ 소프트웨어: 안드로이드 스튜디오, Kotlin

2.2 요구사항 분석서
(1) 요구사항 도출 방법 (자체 요구사항, 고객의 앙케이트, 웹으로부터 조사 등)
■ 브레인스토밍을 통한 자체 요구사항 도출
![image](https://user-images.githubusercontent.com/48309309/160374349-ee8dfdb1-8ef1-4e5d-97cf-11b1d1220401.png)

■ 지인 인터뷰
![image](https://user-images.githubusercontent.com/48309309/160374398-8e7683e3-7d25-4980-804f-692fe8eacf5e.png)
(2) 기능적 요구사항 목록

1. 광고 및 홍보 방지
   ■ 회원 가입을 통해서 광고 및 홍보를 방지한다. 광고 및 홍보 시 관리자는 즉시 해당 아이디를 차단하고, 게시글을 삭제한다.

(3) 비기능적 요구사항 목록

1. 자원
   ■ 인적자원

- 서버 관리자 : 서버 관리 및 DB의 입출력 담당, 최신 정보자료 업데이트
- QA 담당자 : 고객의 문의, 불만 사항, 에러 등 접수, 빠른 답변을 통해 만족도 향상
- 시스템 프로그래머 : 시스템상의 새로운 기능구현과 업데이트 및 에러 디버깅  
  ■ 필요 자원
- Server PC : 시스템 기능을 제공하는 PC로 트래픽에 문제가 되지 않는 사양의 PC를 사용한다. 사용자가 많아져 사양의 한계가 오면 확장한다.
- Database : 고객이 요청한 정보, 쓰레기 품목 등 모든 정보를 저장한다.
- 애플리케이션 설치기기 : “Tradic” 애플리케이션을 설치할 수 있는 안드로이드 기종 스마트폰이 필요하다.

2. 성능
   ■ 반응 시간

- “Tradic” 애플리케이션은 10초 이내에 실행이 되어서 화면이 게재되어야 한다. 사용자는 쓰레기 품목에 대한 정보와 게시글을 작성할 때 보다 빠르게 업데이트한다.

3. 품질
   ■ 정확도

- 사용자가 쓰레기 품목에 대한 정보를 얻을 시 정확한 정보를 얻을 수 있도록 한다.
  ■ 보안
- 데이터베이스 자료와 시스템에 대한 접근은 관리자만이 접근할 수 있도록 통제한다.
  ■ 대비
- 화재 혹은 컴퓨터 바이러스에 의한 데이터 손상을 대비하여 네트워크 연결이 되지 않은 백업용 하드디스크에 저장한다. 백업용 하드디스크는 여러 개를 보유할 수 있도록 하며, 물리적인 충격으로부터 서버를 보호하기 위해 서버를 보유하고 있는 장소는 관계자만이 출입을 허용하여 책임을 명확히 한다.

(4) 기 개발된 유사제품이나 논문, 기술 등 조사
■ 쓰레기 처리방법을 알려주는 웹 페이지(BLISOG)
■ 분리수거 설명 앱(내 손 안의 분리배출)
![image](https://user-images.githubusercontent.com/48309309/160374424-446350f8-c6e3-4f0e-bdca-5ca5c13da934.png)
(5) 관련 특허 조사
■ 모바일 단말기를 통한 재활용품 수거 방법 및 시스템
■ 본 발명은 스마트폰을 통해 재활용이 가능한 물품을 인식한 후에 수거함에 투입될 수 있도록 하는 재활용품 수거 방법 및 시스템이다.
■ (a) 모바일 단말기로 인터넷을 통해 재활용품 수거와 관련된 정보를 제공하는 메인 서버의 웹사이트에 접속하여 회원가입이 이루어지면, 모바일 단말기에서 메인 서버로부터 재활용품 수거용 애플리케이션을 다운로드 받아 설치하는 단계
■ (b) 상기 모바일 단말기에 설치된 재활용품 수거용 애플리케이션이 실행되면 메인 서버로부터 모바일 단말기의 애플리케이션을 통해 회원에 의하여 수거함에 투입할 재활용품의 종류를 선택할 수 있도록 하는 단계
■ (c) 상기 모바일 단말기를 통해 회원에 의하여 재활용품의 종류가 선택되면 재활용품에 부착되어 제품정보를 포함하는 식별 코드(바코드 또는 QR코드)의 유무에 따라 식별 코드가 있으면 모바일 단말기에 의해 촬영된 식별 코드가 인터넷을 통해 메인 서버로 전송되도록 하는 단계
■ (d) 상기 메인 서버는 모바일 단말기에서 수신된 식별코드 정보와 일치하는 재활용품DB에 저장된 제품정보를 검색하는 단계
■ (e) 회원에 의하여 재활용품 수거함의 투입구에 재활용품이 투입되면 재활용품 수거함의 제어부는 투입구에 설치된 중량 센서로부터 측정된 재활용품의 중량정보를 송수신부를 통해 메인 서버로 전송하는 단계
■ (f) 상기 메인서버는 모바일 단말기에서 수신된 식별 코드에 해당하는 제품정보와 재활용품 수거함에서 수신된 중량정보와 일치하는지를 판별한 후에 일치하면 설정된 포인트가 해당 회원의 회원 DB에 적립되도록 하는 단계를 포함하여 이루어진 것이다.
![image](https://user-images.githubusercontent.com/48309309/160374471-795d0b3f-691d-4ae3-a756-745cbc82bd42.png)

■ 본 발명은 모바일 단말기와 재활용 수거용 애플리케이션의 이용과 더불어 재활용품 수거함이 인터넷을 통해 메인 서버로 접속되어 재활용품의 식별 코드나 이미지 정보 및 중량정보에 따라 수거 여부를 비교 및 판별하여 더욱 정확한 재활용품의 수거와 더불어 생활폐기물과 같이 버려지는 재활용품을 분리하여 수거할 수 있도록 하고, 수거함을 설치할 수 없는 일반주택, 소형점포, 사무실 등과 같은 경우에 스마트폰 애플리케이션을 이용하여 제품의 바코드 또는 이미지 촬영 후 자체제작 공급된 소형 수거망에 투입 및 수거함으로써 회원에게 재활용품의 분리 및 수거에 따라 적립해준 포인트나 마일리지 등의 획득과 메인 서버에서 제공하는 웹사이트를 통해 물품구매나 성금 기부 또는 포인트나 마일리지를 현금으로 전환 또는 사용할 수 있도록 하고, 재활용품 수거자에게 재활용할 수 있는 자원을 적은 비용으로 수거할 수 있는 등 자원 절약과 환경오염을 방지할 수 있도록 한다.

(6) 유스케이스다이어그램과 시나리오를 통해 요구사항을 표현
![image](https://user-images.githubusercontent.com/48309309/160374498-25022127-b4b0-4cd8-9ff7-4ba8532674e1.png)
2.3 설계서
(1) 구조설계 및 상세설계
![image](https://user-images.githubusercontent.com/48309309/160374528-527de09b-ea25-42d2-8fe9-f7244dd057d1.png)
![image](https://user-images.githubusercontent.com/48309309/160374558-325162c1-8b1e-446e-aaeb-ba2e665c9db5.png)
(2) 화면설계
![image](https://user-images.githubusercontent.com/48309309/160374581-9b983495-ee4d-4b29-8513-924cbf023c82.png)
2.4 구현(코딩 등) 결과
(1) 소스 코드
![image](https://user-images.githubusercontent.com/48309309/160374603-b024af3a-8354-4fa5-92c4-dfe9232664fc.png)
![image](https://user-images.githubusercontent.com/48309309/160374615-f8fcd226-3692-43ad-aaca-11c1fa8b4f1e.png)
![image](https://user-images.githubusercontent.com/48309309/160374623-ffd72935-5b99-48ed-9750-ae8bb4e53486.png)
![image](https://user-images.githubusercontent.com/48309309/160374631-f49857c7-b4e0-463b-875d-461615e507ba.png)

(2) 구현한 시스템
![image](https://user-images.githubusercontent.com/48309309/160374663-427272b6-fb59-4361-8a08-0af6aeefb199.png)
![image](https://user-images.githubusercontent.com/48309309/160374672-b4fe5738-5be6-4ffc-bd5e-ae9116157dcb.png)
![image](https://user-images.githubusercontent.com/48309309/160374687-88c1ebd3-8ec3-4bd9-b36e-80dc48e8eb08.png)
2.5 시험결과
(1) 요구사항에 대한 시험사례
![image](https://user-images.githubusercontent.com/48309309/160374734-5e9d8c43-3330-4eec-aef6-549a495a6ad2.png)
(2) 요구사항에 대한 시험결과
![image](https://user-images.githubusercontent.com/48309309/160374718-52f641ee-1ed9-41d0-98c8-0e26c9604541.png) 3. 과제수행을 통해 느낀점 및 향후 연구개발내용
3.1 느낀점
■ 황준선 : 프로젝트를 진행하면서 부족한 부분을 공부하며 개발 실력 향상에 도움이 되었습니다. 팀원들과 협업해서 결과물이 나와서 좋았지만, 기존 존재하는 다른 서비스와 차별화하여 보완해야겠다는 아쉬움이 남았습니다.

■ 김유겸 : 중간에 팀원도 나가고 주제도 두 번이나 바꿔서 일도 많고 힘들었고 결과물에도 부족하고 아쉬운 부분들이 있지만 모든 조원이 자기가 맡은 일을 열심히 해서 결과가 나와서 좋습니다.

■ 이가은 : 주제를 선정하는 과정이 순탄치 않아서 초반에는 힘들었지만, 주제를 정하고 나서부터는 팀원들과 애플리케이션을 만드는 과정에서 배운 점이 많았습니다. 처음에 UI 설계를 비롯하여 다양한 작업을 할 때 어떻게 해야 할지 몰라서 막막했는데 팀원분들이 도와주셔서 좋은 결과물이 나왔다고 생각합니다.

■ 이소정 : 이번 캡스톤을 준비부터 힘들었지만, 팀원들과 함께 머리를 맞대고 생각해낸 주제에 설계가 완성되고, 설계한 애플리케이션이 직접 만들어지는 과정에서 보람을 느꼈습니다. 무엇보다 캡스톤 디자인이라는 큰 프로젝트를 수행하면서 팀 작업에 대한 경험을 쌓을 수 있어서 좋았습니다. 그리고 완성된 애플리케이션이 직접 사용될 수 있도록 보완하는 과정을 거듭할 것입니다. 그래서 tradic을 통해 쓰레기의 양이 줄고 올바른 쓰레기 배출 문화가 정착된다면 뿌듯할 것 같습니다.

3.2 향후 연구개발 내용
■ 카테고리에 있는 쓰레기 종류뿐만 아니라 사진을 찍거나 검색을 통해 정보를 얻을 수 있도록 데이터베이스 확장 및 사진을 통한 물건 인식 기술
■ 알루미늄 캔, 플라스틱 등 성질은 달라도 색, 외형이 같은 경우 구분하여서 버릴 수 있도록 앱을 학습시켜 구분할 수 있도록 하는 기능
■ 사용자가 대형폐기물 등 버리기 힘든 물건을 버릴 때 유료기능을 추가해 중계해주거나, 찾아가 버릴 수 있도록 도와주는 기능
■ 산업폐기물 데이터를 추가해서 기업에서도 사용할 수 있도록 데이터베이스를 확장하는 기능
