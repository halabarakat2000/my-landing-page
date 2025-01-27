document.querySelectorAll('.feature').forEach(feature => {
    feature.addEventListener('click', () => {
        // Remove active class from all features
        document.querySelectorAll('.feature').forEach(f => f.classList.remove('active'));

        // Add active class to the clicked feature
        feature.classList.add('active');
    });
});