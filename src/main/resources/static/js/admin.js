
function toggleSidebar() {
    var sidebarMenu = document.getElementById('sidebarMenu');
    var sidebarToggle = document.getElementById('sidebarToggle');
    var sidebar = document.querySelector('.sidebar');

    sidebarMenu.classList.toggle('active');
    sidebarToggle.textContent = sidebarMenu.classList.contains('active') ? '✕' : '☰';

    sidebar.style.width = sidebarMenu.classList.contains('active') ? '200px' : '50px';
}

document.addEventListener("DOMContentLoaded", function() {
    var sidebarLinks = document.querySelectorAll('.sidebar-menu a');
    sidebarLinks.forEach(function(link) {
        link.addEventListener('click', function(event) {
            event.preventDefault();
            var target = this.getAttribute('data-target');
            showContent(target);
        });
    });
});

function showContent(target) {
    var contentItems = document.querySelectorAll('.content-item');
    contentItems.forEach(function(item) {
        if (item.id === target + 'Content') {
            item.style.display = 'block';
        } else {
            item.style.display = 'none';
        }
    });
}
