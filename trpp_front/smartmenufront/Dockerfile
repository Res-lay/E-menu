FROM node:16.0.0 AS build

COPY . /app
WORKDIR /app

RUN npm install
RUN npm run build

EXPOSE 8081
CMD ["npm", "run", "serve"]


