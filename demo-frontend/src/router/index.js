import {createRouter, createWebHistory} from 'vue-router'
import Dashboard from "@/views/Dashboard.vue";
import GridSystem from "@/views/GridSystem.vue";

const routes = [
    {
        path: '/dashboard',
        name: 'Dashboard',
        component: Dashboard
    },
    {
        path: '/grid-system',
        name: 'GridSystem',
        component: GridSystem
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router