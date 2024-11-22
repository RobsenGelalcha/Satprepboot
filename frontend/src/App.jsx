
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import { Layout } from './components/layout'
import { Dashboard } from './components/pages/dashboard'
import { PracticeMath } from './components/pages/practice-math'
import { TestSimulator } from './components/pages/test-simulator'
import { Progress } from './components/pages/progress'

function App() {
    return (
        <Router>
            <Layout>
                <Routes>
                    <Route path="/" element={<Dashboard />} />
                    <Route path="/practice/math" element={<PracticeMath />} />
                    <Route path="/test-simulator" element={<TestSimulator />} />
                    <Route path="/progress" element={<Progress />} />
                </Routes>
            </Layout>
        </Router>
    )
}

export default App

// src/lib/utils.js
import { clsx } from 'clsx'
import { twMerge } from 'tailwind-merge'

export function cn(...inputs) {
    return twMerge(clsx(inputs))
}

// src/services/api.js
const API_BASE_URL = '/api'

export const mathService = {
    getAllQuestions: async () => {
        const response = await fetch(`${API_BASE_URL}/math`)
        if (!response.ok) {
            throw new Error('Network response was not ok')
        }
        return response.json()
    },

    getQuestionsByExam: async (exam) => {
        const response = await fetch(`${API_BASE_URL}/math/exam/${exam}`)
        if (!response.ok) {
            throw new Error('Network response was not ok')
        }
        return response.json()
    },

    getQuestionsByTags: async (tags) => {
        const queryString = tags.map(tag => `tags=${encodeURIComponent(tag)}`).join('&')
        const response = await fetch(`${API_BASE_URL}/math/tags?${queryString}`)
        if (!response.ok) {
            throw new Error('Network response was not ok')
        }
        return response.json()
    }
}
