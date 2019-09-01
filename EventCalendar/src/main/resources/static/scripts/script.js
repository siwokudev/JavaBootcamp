var d = {};
d.offset = 0;

$(document).ready(function() {
    d.window = $(window).height() - d.offset;

    var calendarEl = document.getElementById('calendar');

	 var calendar = new FullCalendar.Calendar(calendarEl, {
	        plugins: ['interaction', 'dayGrid'],
	        timeZone: 'UTC',
	        firstDay: 1,
	        locale: 'es',
	        events: 'http://localhost:8080/eventos',
	        method: 'GET',
	        aspectRatio: 1,
	        contentHeight: d.window,
	        fixedWeekCount: false,
	        header: {
	            left: ' prevYear,prev,next,nextYear today',
	            center: 'title',
	            right: 'dayGridMonth,timeGridWeek,timeGridDay'
	        },
	        editable: true,
	        selectable: true,
	        eventDrop: function (data) {
	            console.log("************DROP");
	        },
	        select: function (info) {
	            console.log("le dio click");
	        },
	        eventClick: function(info) {
	            console.log("************CLICK");
	        },
	        windowResize: function(view) {
	            d.calendar.setOption('contentHeight', d.window);
	        }
	    });

	    calendar.render();
});