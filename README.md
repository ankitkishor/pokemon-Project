# Pokémon Project

## Overview

This is a comprehensive Pokémon project that combines both front-end and back-end technologies to create a seamless Pokémon-related experience. The project utilizes a Pokémon API to fetch and display information about different Pokémon, while also storing and managing data in a MongoDB database using Spring Boot.

The project allows users to:

- Explore  for information about various Pokémon.
- One can click pages to open more Pokémon
- Create and manage their own Pokémon .
- register there own pokemon and display thrm.
- Interact with a user-friendly web interface for a better Pokémon experience.


## Features

- **View Pokémon Details:** Detailed information about a Pokémon is available, including its type, abilities, and more.
- **Create a Pokémon Collection:** Users can create their own Pokémon collection and add Pokémon to it.
- **Edit and Remove Pokémon:** Pokémon can be edited and removed from the collection.(Button not added)
- **Pagination:** Pagination for large lists of Pokémon.

## API Integration

The project integrates with the Pokémon API to fetch data about Pokémon species and individual Pokémon. Ensure that the API credentials are configured correctly in the project's configuration.

## Database Setup
The project uses a MongoDB database to store  Pokémon collections. Ensure that MongoDB is installed and configured correctly for the project.

## Technologies Used

- **Front-end:** HTML, CSS, JavaScript, angular,BootStrap
- **Back-end:** Spring Boot, Java
- **Database:** MongoDB
- **API Integration:** Pokémon API (https://pokeapi.co/”)
- **Version Control:** Git and GitHub


## Future Developments
- **User Authentication:** Implement user authentication and accounts to provide a personalized experience for users, including saving their Pokémon collections.

- **Enhanced Search:** Improve the search functionality to include more advanced filters and sorting options.


## Getting Started

To get this project up and running, follow these steps:

### Prerequisites

1. [Node.js](https://nodejs.org/) must be installed on your machine.

### Installation

```bash
# Clone this repository to your local machine
git clone https://github.com/ankitkishor/pokemon-Project.git

# Navigate to the project directory
cd pokemon-Project

# Install the required dependencies for the front-end
cd client
npm install

# Install the required dependencies for the back-end
cd ..
cd server
mvn clean install

# Start the back-end server
mvn spring-boot:run

# Start the front-end development server
cd ..
cd client
npm start



