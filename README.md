# Проект по автоматизации тестирования мобильного приложения Tutu.ru, покупка билетов всех видов транспорта	:star2:
## <a target="_blank" href="https://www.tutu.ru//">На данном сайте есть ссылка на мобильное приложение Tutu.ru </a> 

![This is an image](design/pictures/hh.jpeg)	

## :clipboard:: Содержание:

- <a href="#trophy-технологии-и-инструменты">Технологии и инструменты</a> 
- <a href="#heavy_check_mark-реализованные-проверки">Реализованные проверки</a>
- <a href="#clipboard_mark-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#computer-запуск-из-терминала">Запуск из терминала</a>
- <a href="#chart_with_downwards_trend-allure-отчет">Allure отчет</a>
- <a href="#bar_chart-интеграция-с-allure-testops">Интеграция с Allure TestOps</a>
- <a href="#chart_with_upwards_trend-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#iphone-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#movie_camera-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :trophy:Технологии и инструменты
                                                                                                        
![This is an image](/design/icons/Java.png)![This is an image](/design/icons/Gradle.png)![This is an image](/design/icons/Intelij_IDEA.png)![This is an image](/design/icons/Selenide.png)![This is an image](/design/icons/Selenoid.png)![This is an image](/design/icons/JUnit5.png)![This is an image](/design/icons/Jenkins.png)![This is an image](/design/icons/Allure_Report.png)![This is an image](/design/icons/AllureTestOps.png)![This is an image](/design/icons/Telegram.png)![This is an image](/design/icons/Jira.png)</br>

## 	:heavy_check_mark: Реализованные проверки</br>
Наличие разделов на главной странице</br>
Поиск билетов из Москвы в Симферополь
Поиск авиабилетов
Поиск билетов на поезд
Поиск билетов на автобус
"</br>

## :clipboard: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/AUTO-1024/">Сборка в Jenkins</a>

![This is an image](design/pictures/jenkins.jpeg)


###  :clipboard: Параметры сборки в Jenkins:
Сборка в Jenkins

- необходимо добавить файл browserstar.properties  и local.properties(содержащий в себе логины и пароли, отдельно для разных видов запуска, пример в папке resources)

## :computer: Запуск из терминала
Локальный запуск:
```
gradle clean test -Dhost=local

```

Удаленный запуск:
```
clean
test
 -Dhost=browserstack
```
## :chart_with_downwards_trend: Allure отчет
- ### Главный экран отчета

 ![This is an image](design/pictures/allure.jpeg)


- ### Страница с проведенными тестами

![This is an image](design/pictures/allure1.jpeg)

## :bar_chart: Интеграция с Allure TestOps
- ### Экран с результатами запуска тестов
                                                                            
![This is an image](design/pictures/allureTestsOp.jpeg)

- ### Страница с тестами в TestOps

![This is an image](design/pictures/AllureTestOps.jpeg)
                                                                            
## :chart_with_upwards_trend:	 Интеграция с Jira
- ### Страница с задачей в Jira
                                                                                
 ![This is an image](design/pictures/jira.jpeg)


## 	:iphone: Отчет в Telegram

 ![This is an image](design/pictures/telegram.jpeg)


## :movie_camera: Видео примеры прохождения тестов


https://user-images.githubusercontent.com/83497921/169890250-97fef0ce-e046-4e11-ad2f-823873ced6b7.mp4




:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
