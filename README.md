# Cafe Management System

A Java Spring Boot cafe management system developed as a team project for the SWEN 261 Software Engineering course at Rochester Institute of Technology - Dubai.

The system supports cafe operations such as order creation, order viewing, order status tracking, order cancellation, pricing package management, inventory item management, low stock alerts, and role-based access control.

## Project Overview

This project was designed for small cafe businesses that need a simple and cost-effective way to manage daily operations. The system helps organize customer orders, pricing packages, inventory workflows, and staff access through a web-based interface.

The project followed a Scrum-based development process, with user stories divided across team members and implemented through feature branches and pull requests.

## My Contributions

As part of the development team, my main contributions included:

- Implemented **US-004: Viewing Pricing Packages**
- Implemented **US-008: Order Cancellation Before Preparation**
- Developed backend model and service logic for assigned features
- Built frontend pages using Mustache templates
- Connected frontend workflows with Spring Boot backend logic
- Helped with testing, debugging, and feature integration
- Contributed to documentation for assigned user stories

## Features

- Create and manage customer orders
- View active and completed orders
- Search and filter orders
- View and select pricing packages
- Track order status
- Cancel orders before preparation
- Manage inventory items
- Display low stock alerts
- Apply role-based access control for admin and staff users
- Use REST endpoints to return JSON responses

## Technology Stack

- **Backend:** Java, Spring Boot
- **Frontend:** Mustache, HTML, CSS
- **Storage:** In-memory ArrayList storage
- **Architecture:** MVC-based structure
- **Project Management:** Scrum, sprint planning, user stories
- **Version Control:** Git and GitHub

## Implementation Details

- Data is stored using in-memory ArrayLists as required by the assignment.
- No external database is used, so data resets when the application restarts.
- Backend functionality is implemented using Spring Boot services and controllers.
- Frontend pages are implemented using Mustache templates.
- Features were developed using a feature branch workflow and pull requests.
- The project includes both frontend and backend integration for the main user stories.

## User Stories Implemented

### Assignment 2

- **US-001:** Creation of Order
- **US-002:** Viewing Orders
- **US-004:** Viewing Pricing Packages
- **US-006:** User Login and Session
- **US-009:** Order Search and Filter

### Assignment 3

- **US-003:** Tracking Order Status
- **US-005:** Selecting Pricing Packages
- **US-007:** Role-Based Access Control
- **US-008:** Order Cancellation Before Preparation
- **US-011:** Inventory Item Management
- **US-012:** Low Stock Alerts

## Team Project Notice

This project was completed as a group assignment. The repository includes contributions from multiple team members. My individual contributions focused mainly on pricing package viewing, order cancellation before preparation, backend logic, frontend integration, testing, and documentation.

## What I Learned

Through this project, I gained practical experience in:

- Building Java Spring Boot applications
- Working with MVC architecture
- Creating backend services and controllers
- Connecting frontend templates with backend logic
- Writing and managing user stories
- Using GitHub feature branches and pull requests
- Collaborating in a software development team
- Testing and debugging web application features
