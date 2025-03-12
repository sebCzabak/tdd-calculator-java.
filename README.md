# Kalkulator TDD z GUI

Prosta aplikacja kalkulatora w Javie, stworzona w podejściu **Test-Driven Development (TDD)** z wykorzystaniem JUnit oraz prostym interfejsem graficznym **Swing**.

## 📚 Funkcje
- Podstawowe operacje arytmetyczne: **Dodawanie, Odejmowanie, Mnożenie, Dzielenie**.
- GUI zbudowane przy użyciu **Java Swing**.
- Walidacja dzielenia przez zero z ostrzeżeniem dla użytkownika.
- Podejście TDD z wykorzystaniem **JUnit 5**.
- Konfiguracja Mavena z generowaniem raportów testów.

---

## 🛠️ Instrukcja uruchomienia

### 1. Sklonuj repozytorium
```bash
git clone https://github.com/TWOJA_NAZWA/tdd-calculator-java.git
cd tdd-calculator-java
```

### 2. Zbuduj projekt
```bash
mvn clean package
```

### 3. Uruchom aplikację GUI
```bash
java -cp target/tdd-calculator-1.0-SNAPSHOT.jar com.example.CalculatorGUI
```

### 4. Uruchom testy i wygeneruj raporty
```bash
mvn clean test
```

- Raporty testów będą dostępne w:
```
target/surefire-reports
```

---

## 🖥️ Przegląd GUI
- **Number 1**: Pierwsza liczba wejściowa.
- **Number 2**: Druga liczba wejściowa.
- **Result**: Pole wyświetlające wynik operacji.
- **Buttons**: Przycisk do wykonania operacji arytmetycznej.
- Wyświetla ostrzeżenie, jeśli użytkownik próbuje dzielić przez zero.

---

## ⚙️ Użyte technologie
- **Java 17**
- **JUnit 5**
- **Maven**
- **Swing** do GUI

---

## ✅ Do zrobienia (opcjonalne rozszerzenia)
- Dodanie dodatkowych operacji matematycznych, takich jak pierwiastki i potęgowanie.
- Ulepszenie wyglądu GUI.
- Dodanie opcji czyszczenia pól wejściowych i wyników.
- Tworzenie zaawansowanych raportów pokrycia testów.

---

## 📄 Licencja
Ten projekt jest udostępniony na licencji MIT.

---
