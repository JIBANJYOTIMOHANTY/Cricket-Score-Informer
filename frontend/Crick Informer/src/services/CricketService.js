import axios from "axios"

const REST_API_URL = "http://localhost:8080/match"

export const getAllMatches = () => axios.get(REST_API_URL)

export const getLiveMatches = () => axios.get(REST_API_URL + "/live")

export const getPointTable = () => axios.get(REST_API_URL + "/point-table")