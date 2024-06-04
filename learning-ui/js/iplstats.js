const idTeamRoleAmountStats = document.getElementById("idTeamRoleAmountStats");
const idTeamRoleCountStats = document.getElementById("idTeamRoleCountStats");
const idShowAmountStats = document.getElementById("idShowAmountStats"); 
const idShowRoleStats = document.getElementById("idShowRoleStats");
const idShowTeamNames = document.getElementById("idShowTeamNames");

google.charts.load('current', {'packages':['corechart']});

async function getPlayers() {
    const response = await fetch("/js/players.json");
    const data = await response.json();
    return data;
}

async function getTeamNames() {
    const players = await getPlayers();
    const teams = new Set();
  
    for (const player of players) {
        teams.add(player.teamName);
    }
    return teams;
}

async function getTeamAmountStats(){
    const players = await getPlayers();
    const teamAmountStats = {};
    for (const player of players) {
        if (teamAmountStats[player.teamName] === undefined) {
            teamAmountStats[player.teamName] = player.amount;
        } else {
            teamAmountStats[player.teamName] += player.amount;
        }
    }
    return teamAmountStats;
}

async function getRoleCountStats(){
    const players = await getPlayers();
    const roleCountStats = {};
    for (const player of players) {
        if (roleCountStats[player.role] === undefined) {
            roleCountStats[player.role] = 1;
        } else {
            roleCountStats[player.role] += 1;
        }
    }
    return roleCountStats;
}

async function getTeamRoleAmountStats(players){
    const teamRoleAmountStats = {};
    for (const player of players) {
            if (teamRoleAmountStats[player.role] === undefined) {
                teamRoleAmountStats[player.role] = player.amount;
            } else {
                teamRoleAmountStats[player.role] += player.amount;
            }
    }
    return teamRoleAmountStats;
}

async function getTeamRoleCountStats(players){
     const teamRoleCountStats = {};
    for (const player of players) {
            if (teamRoleCountStats[player.role] === undefined) {
                teamRoleCountStats[player.role] = 1;
            } else {
                teamRoleCountStats[player.role] += 1;
            }
       
    }
    return teamRoleCountStats;
}
async function getPlayersOf(teamName){
    const players = await getPlayers();
    const teamPlayers = [];
    for (const player of players) {
        if (player.teamName === teamName){
            teamPlayers.push(player);
        }
    }
    return teamPlayers;
}


function showTeamNames(){
    getTeamNames().then(teams => {
        let ele = `<select onchange="showTeamDetails()" id="idTeamName" class='form-select'>`;
        for (const team of teams) {
            ele += `<option value="${team}">${team}</option>`;
        }
        ele += "</select>";
        idShowTeamNames.innerHTML = ele;
    });
}
showTeamNames();

function showTeamDetails(){
    const idTeamName = document.getElementById("idTeamName");
    let teamName = idTeamName.value;
    const players = getPlayersOf(teamName);
    players.then(players => {
        showPlayers(players);
        getTeamRoleAmountStats(players)
        .then(teamRoleAmountStats => {
            showTeamRoleAmountStats(teamRoleAmountStats);
        });
        getTeamRoleCountStats(players).then(teamRoleCountStats => {
            showTeamRoleCountStats(teamRoleCountStats);
        });
    });
}

function showPlayers(players){
    const idShowPlayers = document.getElementById("idShowPlayers");
    let ele = `<table class="table table-striped">`;
    ele += `<tr><th>Player Name</th><th>Role</th><th>Team Name</th><th>Amount</th></tr>`;
    for (const player of players) {
        ele += `<tr><td>${player.name}</td><td>${player.role}</td><td>${player.teamName}</td><td>${player.amount}</td></tr>`;
    }
    ele += "</table>";
    idShowPlayers.innerHTML = ele;
}

function showTeamRoleAmountStats(teamRoleAmountStats){
    data = [];
    for (const role in teamRoleAmountStats) {
        data.push([role, teamRoleAmountStats[role]]);
    }
    drawTeamRoleAmountStatsChart(data);
}
function showTeamRoleCountStats(teamRoleCountStats){
    data = [];
    for (const role in teamRoleCountStats) {
        data.push([role, teamRoleCountStats[role]]);
    }
    drawTeamRoleCountStatsChart(data);
}

function drawTeamRoleAmountStatsChart(inputData){
    let dataArray = [['Role', 'Amount']];
    for(const data of inputData){
        dataArray.push(data);
    }
    console.log(dataArray);
    let data = google.visualization.arrayToDataTable(dataArray);
    let options = {
        title: 'Team Role Amount Stats',
        width: 500,
        height: 380
        
    };
    let chart = new google.visualization.PieChart(idTeamRoleAmountStats);
    chart.draw(data, options);  
}

function drawTeamRoleCountStatsChart(inputData){
    let dataArray = [['Role', 'Count']];
    for(const data of inputData){
        dataArray.push(data);
    }
    console.log(dataArray);
    let data = google.visualization.arrayToDataTable(dataArray);
    let options = {
        title: 'Team Role Count Stats',
        width: 500,
        height: 380
        
    };
    let chart = new google.visualization.ColumnChart(idTeamRoleCountStats);
    chart.draw(data, options);  
}

function drawAmountStatsChart(inputData){
    let dataArray = [['Team', 'Amount']];
    for(const data of inputData){
        dataArray.push(data);
    }
    console.log(dataArray);
    let data = google.visualization.arrayToDataTable(dataArray);
    let options = {
        title: 'Ipl Amount Stats',
        width: 500,
        height: 380
        
    };
    let chart = new google.visualization.ColumnChart(idShowAmountStats);
    chart.draw(data, options);  
}

function drawRoleStatsChart(inputData){
    let dataArray = [['Role', 'Count']];
    for(const data of inputData){
        dataArray.push(data);
    }
    console.log(dataArray);
    let data = google.visualization.arrayToDataTable(dataArray);
    let options = {
        title: 'Ipl Role Count Stats',
        width: 500,
        height: 380
        
    };
    let chart = new google.visualization.PieChart(idShowRoleStats);
    chart.draw(data, options);  
}

function showIplStats(){
    getTeamAmountStats().then(teamAmountStats => {
       let data = [];
         for (const team in teamAmountStats) {
              data.push([team, teamAmountStats[team]]);
         }
        drawAmountStatsChart(data);
    });
    getRoleCountStats().then(roleCountStats => {
       let data = [];
         for (const role in roleCountStats) {
              data.push([role, roleCountStats[role]]);
         }  
         drawRoleStatsChart(data);
    });
}

showIplStats();