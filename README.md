# 🎬 Кинотеатр – UI-концепт

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Platform](https://img.shields.io/badge/Platform-Android-lightgrey)]()
[![Version](https://img.shields.io/badge/Version-1.0-blue)]()

Современный UI-прототип приложения для киноманов. Один экран объединяет афишу сеансов, ожидаемые премьеры, историю просмотров и стриминговые подборки. Всё на Jetpack Compose с плавными анимациями.

---

## ✨ Что внутри экрана

- **🎥 Список фильмов с сеансами (LazyRow)** – горизонтальная лента фильмов, на которые можно купить билеты прямо сейчас. Для каждого отображается постер, название и ближайшие сеансы.
- **🚀 Скоро выйдут (FlowRow)** – облако из карточек ожидаемых новинок. Адаптивный макет: карточки переносятся по строкам в зависимости от ширины экрана.
- **🕒 Последние просмотренные (HorizontalPager)** – свайпабельная галерея фильмов, которые пользователь недавно смотрел. Каждый фильм показывает прогресс просмотра.
- **📺 Streaming (HorizontalPager)** – ещё один пейджер с подборками фильмов, доступных на стриминговых платформах (Netflix, Кинопоиск и др.).

---

## 🛠 Технологический стек

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Material 3](https://img.shields.io/badge/Material%203-757575?style=for-the-badge&logo=materialdesign&logoColor=white)
![Accompanist Pager](https://img.shields.io/badge/HorizontalPager-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![FlowRow](https://img.shields.io/badge/FlowRow-3DDC84?style=for-the-badge&logo=android&logoColor=white)

---

## 🎥 Демонстрация

<p align="center">
  <img src="demo/MovieTheater.gif" width="250" alt="Демонстрация приложения" />
  <br/>
  <em>Прокрутка афиши и перелистывание пейджеров</em>
</p>

---

## 📸 Скриншоты

| Сеансы | FlowRow «Скоро» | HorizontalPager (просмотренные) |
| :---------------------: | :-------------: | :-----------------------------: |
| ![Афиша](screenshots/featured_movies.png) | ![Скоро](screenshots/coming_soon.png) | ![Просмотренные](screenshots/recently_watched.png) |

---

## 🧱 Особенности реализации

- **Полностью на Compose** – все элементы UI построены без XML.
- **LazyRow** используется для горизонтального списка фильмов с сеансами. Каждый элемент — карточка с постером и временем сеансов.
- **FlowRow** для адаптивного облака «Скоро выйдут». Карточки выстраиваются слева направо с переносом.
- **HorizontalPager** для просмотренных и стриминговых подборок.
- **Данные** – заглушки: списки фильмов, постеры (из локальных ресурсов), время сеансов, названия стримингов.
- **Состояние** управляется через `mutableStateListOf` и `mutableIntStateOf` для пейджеров.

---

## 🚀 Быстрый старт

1. Перейдите в раздел [**Releases**](https://github.com/kerikir/MovieTheater/releases).
2. Скачайте APK-файл (`MovieTheater.apk`).
3. **Установка:**
   - Откройте загруженный файл на устройстве Android.
   - При необходимости разрешите установку из неизвестных источников.
   - Завершите установку.
4. Запустите «MovieTheater» и изучайте интерфейс.

> ℹ️ Приложение создано исключительно для демонстрации UI. Все данные статичны, навигация не ведёт к другим экранам.

