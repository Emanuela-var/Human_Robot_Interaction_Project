# 🤖 Furhat Robot for Language Learning

<div align="center">

![Furhat](https://img.shields.io/badge/Furhat-SDK%202.8.0-orange?style=for-the-badge)
![Kotlin](https://img.shields.io/badge/Kotlin-1.9-purple?style=for-the-badge&logo=kotlin&logoColor=white)
![IntelliJ](https://img.shields.io/badge/IntelliJ-IDEA-blue?style=for-the-badge&logo=intellijidea)
![License](https://img.shields.io/badge/License-Academic-green?style=for-the-badge)

**An HRI Experiment on Children's Language Learning Using the Furhat Social Robot**

*Human-Robot Interaction Project*

*Università degli Studi di Napoli Federico II*

</div>

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Research Objective](#-research-objective)
- [The Furhat Robot](#-the-furhat-robot)
- [Experiment Design](#-experiment-design)
- [Learning Activities](#-learning-activities)
- [Implementation](#-implementation)
- [Project Structure](#-project-structure)
- [Installation](#-installation)
- [Usage](#-usage)
- [Results](#-results)
- [Conclusions](#-conclusions)

---

## 🎯 Overview

This project explores how **emotional expressiveness** in social robots affects **language learning outcomes** in children. Using the **Furhat robot** as an English tutor, we compare two interaction modalities: an expressive robot displaying emotions and gestures versus a neutral robot with minimal emotional cues.

The study is grounded in **Human-Robot Interaction (HRI)** research, which investigates how humans and robots can effectively communicate and collaborate, particularly in educational contexts.

---

## 🔬 Research Objective

**Primary Goal**: Demonstrate how a robot's emotional expression influences language learning in children.

**Research Questions**:
- Does emotional expressiveness improve learning engagement?
- Do children perform better with an expressive vs. neutral robot tutor?
- How do children perceive and respond to different robot personalities?

---

## 🤖 The Furhat Robot

**Furhat** is a humanoid social robot designed for natural and intuitive communication with humans.

### Key Features

| Feature | Description |
|---------|-------------|
| **Realistic Facial Expressions** | Projected face enables lifelike emotions |
| **Head & Gaze Movement** | Natural head tracking and eye contact |
| **Natural Multilingual Voice** | Text-to-speech in multiple languages |
| **Social Adaptability** | Responds to user behavior and context |

---

## 🧪 Experiment Design

### Participants

| Participant | Age | Focus |
|-------------|-----|-------|
| Sofia | 9 years | English vocabulary & grammar |
| Christian | 6 years | Basic English words |

### Experimental Conditions

<table>
<tr>
<th>🎭 Expressive Robot</th>
<th>😐 Neutral Robot</th>
</tr>
<tr>
<td>
• Facial expressions (smiles, winks)<br>
• Voice variations (pitch, rate)<br>
• Emotional feedback (joy, empathy)<br>
• Head movements (nodding)
</td>
<td>
• Neutral facial expression<br>
• Monotone voice<br>
• Minimal feedback<br>
• No head movements
</td>
</tr>
</table>

---

## 📚 Learning Activities

Furhat acts as an English tutor through three interactive exercises:

### 1. 🔤 Word Repetition
**Objective**: Child repeats a word proposed by the robot

### 2. 🔄 Synonyms & Antonyms Quiz
**Objective**: Child guesses the synonym or antonym of a given word

### 3. ✏️ Complete the Sentence
**Objective**: Child completes a sentence with an appropriate word

---

## 💻 Implementation

### Development Environment

| Tool | Purpose |
|------|---------|
| **Furhat SDK** | Skill creation and interaction management |
| **Furhat Emulator** | Testing robot behavior in simulation |
| **IntelliJ IDEA** | Kotlin development IDE |

### Key Implementation Differences

| Aspect | Expressive | Neutral |
|--------|------------|---------|
| **Facial Expressions** | `Gestures.BigSmile`, `Gestures.Nod`, `Gestures.Wink` | None |
| **Voice Tone** | `furhat.voice.copy(pitch=1.6, rate=0.9)` | Standard voice |
| **Motivational Feedback** | "You're doing great!", "Wonderful!" | "That's correct.", "Wrong." |
| **Head Movements** | `Gestures.Nod` for encouragement | None |

---

## 📁 Project Structure

```
Furhat-Language-Learning/
│
├── 📂 Englishteacher/                 # 🎭 EXPRESSIVE VERSION
│   ├── assets/
│   │   └── webTemplates/BASIC/        # Web interface templates
│   ├── gradle/wrapper/                # Gradle wrapper files
│   ├── src/                           # Kotlin source code
│   │   └── main/kotlin/furhatos/app/englishteacher/
│   │       ├── main.kt                # Entry point
│   │       ├── flow/                  # Interaction states
│   │       └── nlu/                   # Speech recognition
│   ├── .gitignore
│   ├── README.md
│   ├── build.gradle                   # Build configuration
│   ├── gradlew                        # Gradle wrapper (Unix)
│   ├── gradlew.bat                    # Gradle wrapper (Windows)
│   └── skill.properties               # Skill metadata
│
├── 📂 Neutral/                       # 😐 NEUTRAL VERSION
│   ├── assets/
│   │   └── webTemplates/BASIC/        # Web interface templates
│   ├── gradle/wrapper/                # Gradle wrapper files
│   ├── src/                           # Kotlin source code
│   │   └── main/kotlin/furhatos/app/Neutral/
│   │       ├── main.kt                # Entry point
│   │       ├── flow/                  # Interaction states
│   │       └── nlu/                   # Speech recognition
│   ├── .gitignore
│   ├── README.md
│   ├── build.gradle                   # Build configuration
│   ├── gradlew                        # Gradle wrapper (Unix)
│   ├── gradlew.bat                    # Gradle wrapper (Windows)
│   └── skill.properties               # Skill metadata
│
├── 📄 Presentazione_HRI_EV.pptx       # Project presentation
└── 📄 README.md                       # This file
```

### Folder Description

| Folder | Description |
|--------|-------------|
| `Englishteacher/` | Expressive Furhat skill with emotions, gestures, and motivational feedback |
| `Neutral/` | Neutral Furhat skill with minimal expressions and monotone responses |

---

## 🚀 Installation

### Prerequisites

1. **Furhat SDK** (v2.8.0 or later)
   - Download from [Furhat Developer Portal](https://docs.furhat.io/)
   
2. **IntelliJ IDEA** (Community or Ultimate)
   - Download from [JetBrains](https://www.jetbrains.com/idea/)

3. **Java JDK 11+**

### Setup Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Furhat-Language-Learning.git
   cd Furhat-Language-Learning
   ```

2. **Install and Start Furhat SDK**
   ```bash
   # Launch the Furhat SDK desktop launcher
   ./furhat-sdk-desktop-launcher
   ```
   
3. **Start Virtual Furhat**
   - Open Furhat SDK Launcher
   - Click **"Start Virtual Furhat"**
   - Wait for the emulator to load

4. **Open a skill in IntelliJ IDEA**
   
   **For Expressive Version:**
   ```bash
   cd Englishteacher
   ```
   
   **For Neutral Version:**
   ```bash
   cd Neutral
   ```
   
   - Open IntelliJ IDEA
   - File → Open → Select the skill folder
   - Wait for Gradle sync to complete

5. **Build the project**
   ```bash
   ./gradlew build
   ```

---

## 🎮 Usage

### Running the Expressive Skill

1. **Navigate to the Englishteacher folder**
   ```bash
   cd Englishteacher
   ```

2. **Run the skill**
   ```bash
   ./gradlew run
   ```
   Or run directly from IntelliJ IDEA (Run → Run 'main')

3. **Interact with Furhat**
   - The robot will greet you with expressions and emotions
   - Follow the English learning exercises
   - Receive motivational feedback

### Running the Neutral Skill

1. **Navigate to the Neutral folder**
   ```bash
   cd Neutral
   ```

2. **Run the skill**
   ```bash
   ./gradlew run
   ```

3. **Interact with Furhat**
   - The robot will provide instructions with neutral tone
   - Follow the same exercises with minimal feedback

### Web Interface (Optional)

While the skill is running, you can access the control panel:
- Open browser at `http://localhost:54321`
- Monitor interactions and control the robot manually

### Quick Comparison

| Command | Expressive | Neutral |
|---------|------------|---------|
| Navigate | `cd Englishteacher` | `cd Neutral` |
| Run | `./gradlew run` | `./gradlew run` |
| Expected Behavior | Smiles, nods, encouraging phrases | Monotone, minimal response |

---

## 📊 Results

### Performance Comparison

| Metric | Expressive Furhat | Neutral Furhat |
|--------|-------------------|----------------|
| **Emotional Engagement** | High (wonder, enthusiasm) | Medium-Low |
| **Answer Accuracy** | Higher | Lower |
| **Average Response Time** | Faster | Slower |
| **Children's Feedback** | "It's fun!" | "Not very stimulating" |

### Key Findings

1. **🎯 Higher Engagement**: Children showed significantly more enthusiasm with the expressive robot
2. **📈 Better Performance**: Accuracy in language exercises was higher with the expressive tutor
3. **⚡ Faster Responses**: Children responded more quickly, suggesting higher motivation
4. **😊 Positive Perception**: Children described the expressive robot as "fun" and "friendly"

---

## 💡 Conclusions

This experiment demonstrates that **emotional expressiveness in social robots significantly enhances language learning outcomes** in children.

### Future Work

- Expand participant pool for statistical significance
- Long-term learning retention studies
- Adaptive expressiveness based on child's emotional state

---

## 📄 License

This project is developed for academic purposes as part of the Human-Robot Interaction course at Università degli Studi di Napoli Federico II.

