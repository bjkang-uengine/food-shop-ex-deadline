
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import StoreOrderManager from "./components/listers/StoreOrderCards"
import StoreOrderDetail from "./components/listers/StoreOrderDetail"

import OederManager from "./components/listers/OederCards"
import OederDetail from "./components/listers/OederDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import DeadlineManager from "./components/listers/DeadlineCards"
import DeadlineDetail from "./components/listers/DeadlineDetail"

import MenuManager from "./components/listers/MenuCards"
import MenuDetail from "./components/listers/MenuDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/storeOrders',
                name: 'StoreOrderManager',
                component: StoreOrderManager
            },
            {
                path: '/storeOrders/:id',
                name: 'StoreOrderDetail',
                component: StoreOrderDetail
            },

            {
                path: '/oeders',
                name: 'OederManager',
                component: OederManager
            },
            {
                path: '/oeders/:id',
                name: 'OederDetail',
                component: OederDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/deadlines',
                name: 'DeadlineManager',
                component: DeadlineManager
            },
            {
                path: '/deadlines/:id',
                name: 'DeadlineDetail',
                component: DeadlineDetail
            },

            {
                path: '/menus',
                name: 'MenuManager',
                component: MenuManager
            },
            {
                path: '/menus/:id',
                name: 'MenuDetail',
                component: MenuDetail
            },



    ]
})
